public class Main {

        public static void main(String[] args) {
            Ecosistema ecosistema = new Ecosistema("Ecosistema");
            Biotopo biotopo = new Biotopo("Biotopo");
            Biosenosis biosenosis = new Biosenosis("Biosenosis");
            Location location = new Location("Location");
            ecosistema.setNombre("Ecosistema");
            biotopo.setNombre("Biotopo");
            biosenosis.setNombre("Biosenosis");
            location.setNombre("Location");
            System.out.println(ecosistema.toString());
            System.out.println(biotopo.toString());

        }
}
