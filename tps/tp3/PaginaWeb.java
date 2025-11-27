package tp3;

public class PaginaWeb {
    private String url;
    private int visitas;

    public PaginaWeb(String url, int visitas) {
        this.url = url;
        this.visitas = visitas;
    }

    public String getUrl() { return url; }
    public int getVisitas() { return visitas; }

    @Override
    public String toString() {
        return "PaginaWeb{url='" + url + "', visitas=" + visitas + "}";
    }
}