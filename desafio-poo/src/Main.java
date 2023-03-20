import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JAVASCRIPT");
        curso2.setDescricao("Descrição curso JAVASCRIPT");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKAROL = new Dev();
        devKAROL.setNome("KAROL");
        devKAROL.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Karol:" + devKAROL.getConteudosInscritos());
        devKAROL.progredir();
        devKAROL.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Karol:" + devKAROL.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Karol:" + devKAROL.getConteudosConcluidos());
        System.out.println("XP:" + devKAROL.calcularTotalXp());

        System.out.println("-------");
        System.out.println("-------");
        System.out.println("-------");

        Dev devRAMON = new Dev();
        devRAMON.setNome("RAMON");
        devRAMON.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ramon:" + devRAMON.getConteudosInscritos());
        devRAMON.progredir();
        devRAMON.progredir();
        devRAMON.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Ramon:" + devRAMON.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ramon:" + devRAMON.getConteudosConcluidos());
        System.out.println("XP:" + devRAMON.calcularTotalXp());

    }

}
