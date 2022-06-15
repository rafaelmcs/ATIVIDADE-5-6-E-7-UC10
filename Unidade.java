public class Unidade {
    private int cd_unidade;
    private String ds_unidade;

    /*Construtor que recebe o codigo da unidade e a descrição da unidade como argumento e realiaz a insercção
    * de seus valores*/


    public Unidade(int cd_unidade, String ds_unidade) {
       this.setCd_unidade(cd_unidade);
       this.setDs_unidade(ds_unidade);
    }
    /*CONSTRUTOR VAZIO PERMITINDO QUE A CLASS SEJA INSTANCIADA SEM ARGUMENTO*/
    public Unidade() {
    }

    /*METODO GET USADO PARA PERMITE O ACESSO DO CODIGO A UNIDADE*/
    public int getCd_unidade() {
        return cd_unidade;
    }

    /*METODO SET PARA PERMITE A INSERCAO DE VALORES DE ATRIBUTO CODIGO DA UNIDADE*/
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

    /*METODO GET USADO PARA PERMITE O ACESSO DO ATRIBUTO DE DESCRIÇÃO DO CODIGO A UNIDADE*/
    public String getDs_unidade() {
        return ds_unidade;
    }

    public void setDs_unidade(String ds_unidade) {
        this.ds_unidade = ds_unidade;
    }
}
