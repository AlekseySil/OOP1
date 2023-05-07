public class Printer {
    public void print(GryffindorStudents[] gryffindors) {
        System.out.println("Размер списка " + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            GryffindorStudents gryffindor = gryffindors[i];
            System.out.println("Имя - " + gryffindor.getName() + "; магия " + gryffindor.getMagic()
                    + "; трансгресия " + gryffindor.getTransgression() + ";  благородство " + gryffindor.getNobility()
                    + "; честь " + gryffindor.getHonour() + "; храбрость " + gryffindor.getBravery());
        }
    }

    public void print(HufflepuffStudents[] hufflepuffs) {
        System.out.println("Размер списка " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            HufflepuffStudents hufflepuff = hufflepuffs[i];
            System.out.println("Имя - " + hufflepuff.getName() + "; магия " + hufflepuff.getMagic() + "; трансгрессия "
                    + hufflepuff.getTransgression() + "; трудолюбие " + hufflepuff.getIndustriousness()
                    + "; верность " + hufflepuff.getLoyalty() + "; честь " + hufflepuff.getHonour());
        }
    }

    public void print(RavenclawStudents[] ravenclaws) {
        System.out.println("Размер списка " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            RavenclawStudents ravenclaw = ravenclaws[i];
            System.out.println("Имя - " + ravenclaw.getName() + "; магия " + ravenclaw.getMagic() +
                    "; трансгрессия " + ravenclaw.getTransgression() + "; ум " + ravenclaw.getMind() +
                    "; мудрость " + ravenclaw.getWisdom() + "; остроумие " + ravenclaw.getWit() +
                    "; творчество " + ravenclaw.getCreation());
        }
    }

    public void print(SlytherinStudents[] slytherins) {
        System.out.println("Размер списка " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            SlytherinStudents slytherin = slytherins[i];
            System.out.println("Имя - "+ slytherin.getName() + "; магия " + slytherin.getMagic() +
                    "; трансгрессия " + slytherin.getTransgression() + "; хитрость "+ slytherin.getTrick() +
                    "; решительность "+ slytherin.getDetermination() + "; амбициозность " + slytherin.getAmbition()
                    + "; находчивость " + slytherin.getResourcefulness() +
                    "; жажда власти " + slytherin.getPower());
        }
    }
}

