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
      if(pesquisar(socios, socio[0], nSocios)) {
        nSocios = inserirSocio(socios, socio, nSocios);
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

    
public static boolean pesquisar(String[][] s, String text, int n){ 
  int p;
  for (int i = 0; i < n; i++) {
    if (text.equalsIgnoreCase(s[i][0])){
      return false; 
    } 
  }
  return true;    
}

public static int inserirSocio(String[][] s, String[] socio, int n){
  int p = posição(s, n, socio);
  n = inserir(s, n, p, socio);
  return n;  
}

public static int posição(String[][] s, int n, String[] socio){
  if (n == 0){
    return 0;
  }else{
    for (int i = 0; i < n; i++) {
      if (socio[1].compareToIgnoreCase(s[i][1]) < 0){
        return i; 
      } 
    } 
  }
  return n;  
}

public static int inserir(String[][] s, int n, int p, String[] socio){
  if (p <= n){
    for (int i = n; i > p; i--) {
      s[i] = s[i-1]; 
    }
    s[p] = socio;
    n++;
    return n;
  }else{
    System.out.println("inserir - posição não existe no vetor");
    return n; 
  }  
}
