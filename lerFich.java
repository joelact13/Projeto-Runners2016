public static int lerFich(String[][] socios, String fich, int nSocios) throws FileNotFoundException{
  Scanner file = new Scanner(new File(fich));
  String[] socio;
  String linha;
  while (file.hasNext()){
    linha = file.nextLine().trim();
    if (linha.length() > 0){
      socio = linha.split(";");
      socio[0] = socio[0].trim();
      socio[1] = socio[1].toUpperCase().trim();
      socio[2] = socio[2].trim();
      socio[3] = "" + socio[3].trim().toUpperCase().charAt(0);
      if(metodosV.pesquisar(socios, socio[0], nSocios)) {
        nSocios = metodosV.inserirSocio(socios, socio, nSocios);
      }else{
        System.out.println("ERRO: O sócio " + socio[1] + " já existe");
        try{
          System.out.println("Para continuar clique ENTER.");
          System.in.read();
        }catch (IOException e){
          System.out.println("ERRO: Tecla desconhecida");
        }
      }
    }
  }
  System.out.print("----------------------\nFicheiro carregado com sucesso\n----------------------\n\n");
  return nSocios;
}
