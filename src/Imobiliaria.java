public class Imobiliaria {
    String nome;
    String telefone;
    String cidade;
    Apartamento[] apartamentos = new Apartamento[30];

    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    void addApartamento(Apartamento apto) {
        for (int i = 0; i < this.apartamentos.length; i++) {
            if (this.apartamentos[i] == null) {
                this.apartamentos[i] = apto;
                break;
            }
        }
    }

    void ajustaAluguel() {
        for (int i = 0; i < this.apartamentos.length; i++) {
            if (this.apartamentos[i] != null) {
                double aluguelAtual = this.apartamentos[i].aluguel;
                this.apartamentos[i].aluguel += (aluguelAtual * 0.05);
            }
        }
    }

    int mediaArea() {
        int nMedia = 0;
        int media = 0;

        for (int i = 0; i < this.apartamentos.length; i++) {
            if (this.apartamentos[i] != null) {
                if (this.apartamentos[i].numQuartos <= 2) {
                    media += (int)this.apartamentos[i].area;
                    nMedia++;
                }
            }
        }

        return media / nMedia;
    }

    void mostraInfo() {
        System.out.printf("\nINFO Imobiliária:\nNome: %s\nTelefone: %s\nCidade: %s\n",
                this.nome, this.telefone, this.cidade);

        if (this.apartamentos.length == 0) {
            System.out.println("NENHUM APARTAMENTO NO MOMENTO");
            return;
        }
        
        System.out.println("\nINFO APARTAMENTOS\n");
        for (Apartamento apto : this.apartamentos) {
            if (apto != null) {
                apto.mostraInfo();
            }
        }
    }
}
