import java.util.ArrayList;

public class RedeSocial {


        ArrayList<Publicao> publicacoes = new ArrayList<> ();
        private String dataCriacao;
        private String nomeUsuario;
        private String dataNacimento;
        private String senha;

        public RedeSocial(String dataCriacao, String nomeUsuario, String dataNacimento, String senha) {
            this.dataCriacao = dataCriacao;
            this.nomeUsuario = nomeUsuario;
            this.dataNacimento = dataNacimento;
            this.senha = senha;
        }

        public ArrayList<Publicao> getListaPublicacao() {
            return publicacoes;
        }
    
        public void setListaPublicacao(ArrayList<Publicao> publicacoes) {
            this.publicacoes = publicacoes;
        }

        public String getDataCriacao() {
            return dataCriacao;
        }
        public void setDataCriacao(String dataCriacao) {
            this.dataCriacao = dataCriacao;
        }
        public String getNomeUsuario() {
            return nomeUsuario;
        }
        public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
        }
        public String getDataNacimento() {
            return dataNacimento;
        }
        public void setDataNacimento(String dataNacimento) {
            this.dataNacimento = dataNacimento;
        }
        public String getSenha() {
            return senha;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }
        

    
        public void inserePublicacao (Publicao publi ){
            publicacoes.add(publi);
        }

        public void imprimePublicacoes() {
            System.out.println("total de publicacoes " + Publicao.contadorPublicacao);
            for (Publicao publi : publicacoes) {
                System.out.println(publi);
            }
        


        }

    }
