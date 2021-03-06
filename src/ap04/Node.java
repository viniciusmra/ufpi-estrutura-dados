package ap04;

public class Node {
    private String nome;
	private Node prox;
    private boolean excluido; // atributo que diz se o elemento foi excluído ou não
		
		public Node(String nome) {
			this.nome = nome;
			this.prox = null;
            this.excluido = false;
		}

        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome=nome;
        }
         public Node getProx(){
            return prox;
        }
        public void setProx(Node prox){
            this.prox=prox;
        }
        public boolean getExcluido(){
            return excluido;
        }
        public void setExcluido(boolean b){
            excluido = b;
        }
        
}
