
public class ListaEncadeada {
    public No inicio;
    public int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // Minhas Funções Auxiliares

    public void adicionaPrimeiro(Pessoa valor){
       No novo_no = new No();
       novo_no.valor = valor;
       novo_no.proximo = null;
       this.inicio = novo_no;
       this.tamanho = 1;

    }

    public void removePrimeiro(){
        if(this.tamanho == 1){
            this.inicio = null;
            tamanho = 0;
        }else{
            inicio = inicio.proximo;
            tamanho--;
        }
    }

    public void adicionaFinal(Pessoa valor){
        No novo_no = new No();
        novo_no.valor = valor;
        novo_no.proximo = null;

        No procura_no = new No();

        procura_no = inicio;

        while(procura_no.proximo != null){
            procura_no = procura_no.proximo; // corre a lista ate o ultimo no
        }

        procura_no.proximo = novo_no;
        tamanho++;
    }

    public void removeFinal(){
        if(this.tamanho == 1){
            this.inicio = null;
            tamanho = 0;
        }else{
            No procura_no = new No();
            No aux_no = new No();
            procura_no = inicio;
            while(procura_no.proximo != null){
                procura_no = procura_no.proximo; // corre a lista ate o ultimo no
                aux_no = procura_no;
            }
            aux_no.proximo = null;
            tamanho--;
        }    
    }

    
    
    public boolean listaVazia (){
		if ( inicio == null){
			return true;
			
		} else {
			return false;
			
		}
	}




















}