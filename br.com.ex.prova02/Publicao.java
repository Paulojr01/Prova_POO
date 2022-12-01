public class Publicao {
    
    private String dataPublicacao = "";
    private String textoPublicacao  = "";
    private String linkMidia  = "" ;

    public static double contadorPublicacao = 0;
    
    public Publicao(String dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
    }
    public String getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    public String getTextoPublicacao() {
        return textoPublicacao;
    }
    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }
    public String getLinkMidia() {
        return linkMidia;
    }
    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    @Override
    public String toString() {
        return "Publição  [dataPublicacao=" + dataPublicacao + ", textoPublicacao=" + textoPublicacao + ", linkMidia="
                + linkMidia + "]";
    }




}
