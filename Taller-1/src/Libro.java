/**
 *
 * @author Keinner Ramos
 */
public class Libro{
    String titulo;
    String autor;
    int numeroPagina;
   
        public Libro() {
        titulo = "";
        autor = "";
        numeroPagina = 0;
    }
    public Libro(String titulo, String autor, int numeroPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
  }
 

    public void MostrarLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("Numero de pagina: " + numeroPagina);
    }
    
    public static void main(String[] args) {
        Libro Lib = new Libro("2025" ,"Metamorphosis", 327);
        Lib.MostrarLibro();
    }
}
