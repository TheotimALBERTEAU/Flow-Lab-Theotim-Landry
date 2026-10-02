// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.
public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("user"));
    System.out.println(saluerParHeureFrancaise("user"));
  }

  static String saluer(String nom) {
    // TODO: chaque membre du groupe ajoute ICI sa salutation, dans sa propre branche.
    return "Hello, " + nom + " il fallait une heure donc il est 13h44 !";
  }

  static String saluerParHeureFrancaise(String nom) {
    return "Hello " + nom + " il est 13h25 !!";
  }
}
