import me.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devCamila.getNome() + ":"  + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devCamila.getNome() + ":"  + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluídos " + devCamila.getNome() + ":"  + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devAlexcolman = new Dev();
        devAlexcolman.setNome("Alexcolman");
        devAlexcolman.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devAlexcolman.getNome() + ":"  + devAlexcolman.getConteudosInscritos());
        devAlexcolman.progredir();
        devAlexcolman.progredir();
        devAlexcolman.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devAlexcolman.getNome() + ":"  + devAlexcolman.getConteudosInscritos());
        System.out.println("Conteudos Concluídos " + devAlexcolman.getNome() + ":"  + devAlexcolman.getConteudosConcluidos());
        System.out.println("XP:" + devAlexcolman.calcularTotalXp());

        System.out.println("-------");

        Dev devWaleska = new Dev();
        devWaleska.setNome("Waleska");
        devWaleska.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devWaleska.getNome() + ":"  + devWaleska.getConteudosInscritos());
        devWaleska.progredir();
        devWaleska.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devWaleska.getNome() + ":"  + devWaleska.getConteudosInscritos());
        System.out.println("Conteudos Concluídos " + devWaleska.getNome() + ":"  + devWaleska.getConteudosConcluidos());
        System.out.println("XP:" + devWaleska.calcularTotalXp());

        System.out.println("-------");

        Dev devSteve = new Dev();
        devSteve.setNome("Steve");
        devSteve.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devSteve.getNome() + ":"  + devSteve.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devSteve.getNome() + ":"  + devSteve.getConteudosInscritos());
        System.out.println("Conteudos Concluídos " + devSteve.getNome() + ":"  + devSteve.getConteudosConcluidos());
        System.out.println("XP:" + devSteve.calcularTotalXp());


    }
}
