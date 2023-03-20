public class Apartamento {
   String endereco;
   int numQuartos;
   double area;
   double aluguel;

   public Apartamento(String endereco, int numQuartos, double area, double aluguel) {
       this.endereco = endereco;
       this.numQuartos = numQuartos;
       this.area = area;
       this.aluguel = aluguel;
   }

   void mostraInfo() {
       System.out.printf("INFO APARTAMENTO:\nEndereço: %s\nNum. quartos: %d\nÁrea: %.3f\nAluguel: %.3f\n\n",
               this.endereco, this.numQuartos, this.area, this.aluguel);
   }
}
