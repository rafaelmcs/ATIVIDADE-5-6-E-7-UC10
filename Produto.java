public class Produto {
    private int cd_produto;
    private String ds_produto;
    private double vl_produto;
    private double qt_produto;

    private int cd_unidade;

    public Produto(int cd_produto, String ds_produto, double vl_produto, double qt_produto, int cd_unidade) {
        this.setCd_produto(cd_produto);
        this.setDs_produto(ds_produto);
        this.setQt_produto(vl_produto);
        this.setQt_produto(qt_produto);
        this.setCd_unidade(cd_unidade);
    }

    public Produto() {
    }

    private void setCd_unidade(int cd_unidade) {
    }

    public int getCd_produto() {
        return cd_produto;


    }

    /*METODO SET USADO PARA PERMITE O ACESSO DO ATRIBUTO CD PRODUTO*/
    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

    /*/*METODO GET USADO PARA PERMITE O ACESSO DO ATRIBUTO DESCRIÇÃO A PRODUTO*/
    public String getDs_produto() {
        return ds_produto;
    }

    /*METODO SET PARA PERMITE A INSERCAO DE VALORES DE ATRIBUTO CODIGO DA UNIDADE*/
    public void setDs_produto(String ds_produto) {
        this.ds_produto = ds_produto;
    }

    /*METODO GET USADO PARA PERMITE O ACESSO DO ATRIBUTO VALORES DO PRODUTO*/
    public double getVl_produto() {
        return vl_produto;
    }

    public void setVl_produto(double vl_produto) {
        this.vl_produto = vl_produto;
    }

    /*METODO GET USADO PARA PERMITE O ACESSO DO ATRIBUTO QUANTIDADE DO PRODUTO*/
    public double getQt_produto() {
        return qt_produto;
    }

    public void setQt_produto(double qt_produto) {
        this.qt_produto = qt_produto;
    }
}

