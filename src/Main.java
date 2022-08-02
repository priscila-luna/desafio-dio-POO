import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Curso dominando Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Curso dominando Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Mentoria sobre a linguagem Java");
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

        Dev devPriscila = new Dev();
        devPriscila.setNome("Priscila");
        devPriscila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Priscila: \n " + devPriscila.getConteudosInscritos());
        devPriscila.progredir();
        devPriscila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Priscila: \n " + devPriscila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Priscila: \n " + devPriscila.getConteudosConcluidos());
        System.out.println("XP: " + devPriscila.calcularTotalXp());

        System.out.println("______________________________________");

        Dev devRodolfo = new Dev();
        devRodolfo.setNome("Rodolfo");
        devRodolfo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodolfo: \n" + devRodolfo.getConteudosInscritos());
        devRodolfo.progredir();
        devRodolfo.progredir();
        devRodolfo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Rodolfo: \n" + devRodolfo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Rodolfo: \n" + devRodolfo.getConteudosConcluidos());
        System.out.println("XP: " + devRodolfo.calcularTotalXp());



    }
}
