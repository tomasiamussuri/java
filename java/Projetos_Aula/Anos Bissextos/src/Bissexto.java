public class Bissexto {

    int ano;202

    public void calculaBissexto(){
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano: " + ano + " é bissexto.");
        } else {
            System.out.println("O ano: " + ano + " não é bissexto.");
        }
    }

}

/*
    Para identificar se um ano é bissexto ou não, existem algumas regras a serem seguidas:
        1. São bissextos todos os anos múltiplos de 400, como 1600, 2000, 2400, e assim por diante.
        2. São bissextos todos os anos múltiplos de 4 e que não são múltiplos de 100, como 1996, 2004, 2008, 2012, entre outros.
        3. Todos os demais anos não são bissextos.

 */