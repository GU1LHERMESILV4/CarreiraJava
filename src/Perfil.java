public class Perfil {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lnaçamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinospse;
        sinospse = """
                Filme Top Gun
                Filme de Aventura com galã dos anos 80
                Muito Bom!
                Ano de Lançamento:
                """ + anoDeLancamento;
        System.out.println(sinospse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


    }
}
