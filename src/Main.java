import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Introdução a Testes de Software");
        curso2.setDescricao("Descrição Curso Introdução a Testes de Software");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Testes Unitários com jUnit");
        curso3.setDescricao("Descrição Curso Testes Unitários com jUnit");
        curso3.setCargaHoraria(2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição Mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
           bootcamp.setNome("GFT Quality Assurance");
           bootcamp.setDescricao("Descrição Bootcamp GFT Quality Assurance");
           bootcamp.getConteudos().add(curso1);
           bootcamp.getConteudos().add(curso2);
           bootcamp.getConteudos().add(curso3);
           bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java GFT");
        bootcamp1.setDescricao("Descrição Bootcamp Java GFT");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(mentoria);


        System.out.println("****************************************************************************************");

        System.out.println();
        Dev devCamila = new Dev();
        devCamila.setNome("CAMILA ANDRADE");
        System.out.println("Aluno inscrito: "+devCamila.getNome());
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp inscrito: " +bootcamp.getNome());
        System.out.println("Conteudos inscritos: \n" + devCamila.conteudosInscritos()+" ");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("**********-----**********");
        System.out.println("Conteudos inscritos após progressão: \n" + devCamila.conteudosInscritos());
        System.out.println("**********-----**********");
        System.out.println("Conteudos concluídos: \n" + devCamila.conteudosConcluidos());
        System.out.println("Pontuação XP: "+devCamila.calcularTotalXp());
        System.out.println("**********-----**********");
        devCamila.aprovado(bootcamp);
        if(devCamila.aprovado(bootcamp)){
            System.out.println("Você concluiu o BootCamp, boa sorte nas próximas etapas!!");
        }else {
            System.out.println("Não foi dessa vez, você não foi aprovado no bootcamp, mas não desista, teremos outras oportunidade para você.");
        }


        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.println();
        Dev devLucio = new Dev();
        devLucio.setNome("LÚCIO RIBEIRO");
        System.out.println("Aluno inscrito: "+devLucio.getNome());
        devLucio.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp inscrito: " +bootcamp.getNome());
        System.out.println("Conteudos inscritos: \n" + devLucio.conteudosInscritos()+" ");
        devLucio.progredir();
        devLucio.progredir();
        System.out.println("**********-----**********");
        System.out.println("Conteudos inscritos após progressão: \n" + devLucio.conteudosInscritos());
        System.out.println("**********-----**********");
        System.out.println("Conteudos concluídos: \n" + devLucio.conteudosConcluidos());
        System.out.println("Pontuação XP: "+devLucio.calcularTotalXp());
        System.out.println("**********-----**********");
        devLucio.aprovado(bootcamp);
        if(devLucio.aprovado(bootcamp)){
            System.out.println("Você concluiu o BootCamp, boa sorte nas próximas etapas!!");
        }else {
            System.out.println("Não foi dessa vez, você não foi aprovado no bootcamp, mas não desista, teremos outras oportunidade para você.");
        }

        System.out.println();
        Dev devMaria = new Dev();
        devMaria.setNome("MARIA RIBEIRO");
        System.out.println("Aluno inscrito: "+devMaria.getNome());
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp inscrito: " +bootcamp.getNome());
        System.out.println("Conteudos inscritos: \n" + devMaria.conteudosInscritos()+" ");
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("**********-----**********");
        System.out.println("Conteudos inscritos após progressão: \n" + devMaria.conteudosInscritos());
        System.out.println("**********-----**********");
        System.out.println("Conteudos concluídos: \n" + devMaria.conteudosConcluidos());
        System.out.println("Pontuação XP: "+devMaria.calcularTotalXp());
        System.out.println("**********-----**********");
        devMaria.aprovado(bootcamp);
        if(devMaria.aprovado(bootcamp)){
            System.out.println("Você concluiu o BootCamp, boa sorte nas próximas etapas!!");
        }else {
            System.out.println("Não foi dessa vez, você não foi aprovado no bootcamp, mas não desista, teremos outras oportunidade para você.");
        }

        System.out.println();
        Dev devMiguel = new Dev();
        devMiguel.setNome("MIGUEL RIBEIRO");
        System.out.println("Aluno inscrito: "+devMiguel.getNome());
        devMiguel.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp inscrito: " +bootcamp.getNome());
        System.out.println("Conteudos inscritos: \n" + devMiguel.conteudosInscritos()+" ");
        devMiguel.progredir();
        devMiguel.progredir();
        System.out.println("**********-----**********");
        System.out.println("Conteudos inscritos após progressão: \n" + devMiguel.conteudosInscritos());
        System.out.println("**********-----**********");
        System.out.println("Conteudos concluídos: \n" + devMiguel.conteudosConcluidos());
        System.out.println("Pontuação XP: "+devMiguel.calcularTotalXp());
        System.out.println("**********-----**********");
        devMiguel.aprovado(bootcamp);
        if(devMiguel.aprovado(bootcamp)){
            System.out.println("Você concluiu o BootCamp, boa sorte nas próximas etapas!!");
        }else {
            System.out.println("Não foi dessa vez, você não foi aprovado no bootcamp, mas não desista, teremos outras oportunidade para você.");
        }

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Os melhores desenvolvedores:");
        for( Dev dev : bootcamp.tresMelhoresDevs()){
            System.out.println(dev.getNome());
        }


    }
}
