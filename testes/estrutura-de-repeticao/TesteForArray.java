public class TesteForArray {
  public static void main(String[] args) {
    
    String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

    for(int i = 0; i < alunos.length; i++){
      if(alunos[i].equalsIgnoreCase("JULIA")){
        break;
      }
      System.out.println(alunos[i]);
    }

    System.out.println("-------------------------");
    System.out.println("OU");
    System.out.println("-------------------------");

    for(String aluno: alunos){
      if(aluno.equalsIgnoreCase("JULIA")){
        continue;
      }
      System.out.println(aluno);
    }

  }
}
