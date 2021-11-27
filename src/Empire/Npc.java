package Empire;

import java.util.Random;

            /*================
                  NPCs
             ================*/

class Npc extends EmpireGame.Engine {
    static class Villager {
        // created from town

        int number;
        int hp = 20;
        String name;
        public String gender = determineGender();
        public String nickname = createNickname();
        String job;

        public String determineGender() {
            Random rand = new Random();
            int genderValue = rand.nextInt(2);
            switch (genderValue) {
                case 0:
                    return "male";
                case 1:
                    return "female";
            }
            return gender = String.valueOf(genderValue);
        }
        public String createNickname() {
            nickname = gender;
            assert nickname != null;
            if (nickname.equals("male")){
                final String[] maleNickname = {"Eudes", "Garnier", "Gosse", "Josse", "Roul",
                        "Roland", "Vauqelin", "Jehan", "Fernnand", "Piers",
                        "Geoffroi", "Estienne", "Guiscard", "Onfroi", "Franchesco"};
                Random randomMale = new Random();
                int index = randomMale.nextInt(maleNickname.length);
                return maleNickname[index];
            }
            if (nickname.equals("female")){
                final String[] maleNickname = {"Eudes", "Garnier", "Gosse", "Josse", "Roul",
                        "Roland", "Vauqelin", "Jehan", "Fernnand", "Piers",
                        "Geoffroi", "Estienne", "Guiscard", "Onfroi", "Franchesco"};
                Random randomMale = new Random();
                int index = randomMale.nextInt(maleNickname.length);
                return maleNickname[index];
            }
            return nickname;
        }
    }
}