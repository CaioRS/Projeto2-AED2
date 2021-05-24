import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Random;

import javax.lang.model.type.NullType;

public class App {
    public static void main(String[] args) throws IOException {
        
        Pessoa p1 = new Pessoa("Caio","11111111","aaa@aaaa.com");
        Pessoa p2 = new Pessoa("Giovanna","22222222","bbb@bbbb.com");
        Pessoa p3 = new Pessoa("Bruna","33333333","ccc@cccc.com");
        Pessoa p4 = new Pessoa("Beta","44444444","ddd@ddd.com");
        Pessoa p5 = new Pessoa("Claudio","55555555","eee@eee.com");
        Pessoa p6 = new Pessoa("Matheus","66666666","fff@ffff.com");
        Pessoa p7 = new Pessoa("Felipe","77777777","ggg@gggg.com");
        Pessoa p8 = new Pessoa("Rafael","88888888","hhh@hhhh.com");
        Pessoa p9 = new Pessoa("Pietro","99999999","iii@iiii.com");
        Pessoa p10 = new Pessoa("Julia","00000000","jjj@jjjjj.com");
        Pessoa p11 = new Pessoa("Jessika","12345678","kkk@kkkkk.com");
        Pessoa p12 = new Pessoa("Isadora","15315359","lll@llll.com");
        Pessoa p13 = new Pessoa("Alexandre","75931265","mmm@mmmmm.com");
        Pessoa p14 = new Pessoa("Gabriel","19224655","nnn@nnnn.com");
        Pessoa p15 = new Pessoa("Diego","16154232","ooo@ooooo.com");
        Pessoa p16 = new Pessoa("Neymar","13281649","ppp@pppp.com");


        List<Integer> ingressos = new ArrayList<Integer>();

        for(int i=0 ; i<10;i++){
            ingressos.add(1);
        }
        for(int i=0 ; i<10;i++){
            ingressos.add(2);
        }
        for(int i=0 ; i<10;i++){
            ingressos.add(3);
        }
        for(int i=0 ; i<10;i++){
            ingressos.add(4);
        }
        for(int i=0 ; i<10;i++){
            ingressos.add(5);
        }
        
        Collections.shuffle(ingressos);
//---------------------------------------------------------------------------
        Fila f = new Fila();        
        f.adicionar(p1);
        f.adicionar(p2);
        f.adicionar(p3);
        f.adicionar(p4);
        f.adicionar(p5);
        f.adicionar(p6);
        f.adicionar(p7);
        f.adicionar(p8);
        f.adicionar(p9);
        f.adicionar(p10);
        f.adicionar(p11);
        f.adicionar(p12);
        f.adicionar(p13);
        f.adicionar(p14);
        f.adicionar(p15);
        f.adicionar(p16);

        
        //f.mostrar();
        //f.remover();
        //f.mostrar();
//---------------------------------------------------------------------------
        Pilha p = new Pilha();
        for(int i=0 ; i < ingressos.size();i++){
            p.adicionar(ingressos.get(i));
        }
        
       // p.mostrar();
        //p.remover();
        //p.mostrar();
//---------------------------------------------------------------------------
        ListaEncadeada l = new ListaEncadeada();
        No n = new No();

        f.f[f.inicio].SetIngresso(p.p[p.fim]);
        l.adicionaPrimeiro(f.f[f.inicio]);
        f.remover();
        p.remover();

        
        for(int i=1 ; i<=f.fim ; i++){
            f.f[f.inicio].SetIngresso(p.p[p.fim]);
            l.adicionaFinal(f.f[f.inicio]);
            f.remover();
            p.remover();

        }

        Random gerador = new Random();

        int cod = gerador.nextInt();

        

        FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\log"+cod+".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        n = l.inicio;

        bw.write("----------------------------------------------------------\n" );
        bw.write("Total de convidados na fila: " + l.tamanho + "\n");
        bw.write("Total de ingressos disponiveis: " + ingressos.size() + "\n");
        bw.write("----------------------------------------------------------" );
        bw.write("\n\n");

        while(n != null){
            //bw.write(n.valor.nome + ":" + n.valor.ingresso+"\n" );
            bw.write("Nome do convidado: " + n.valor.nome + "\n");
            bw.write("Sala do convidado: " + n.valor.ingresso + "\n");
            bw.write("Email do convidado: " + n.valor.email + "\n" );
            bw.write("Telefone do convidado: " + n.valor.telefone + "\n" );
            bw.write("----------------------------------------------------------" );
            bw.write("\n\n");

            n = n.proximo;
        }

        bw.write("----------------------------------------------------------\n" );
        bw.write("Total de convidados sem ingresso: " + f.qtdeElementos + "\n");
        bw.write("Total de ingressos restantes: " + p.qtdeElementos + "\n");
        bw.write("----------------------------------------------------------" );
        bw.write("\n\n");
 
        bw.close();
        fw.close();


    }    
}
