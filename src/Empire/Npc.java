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

        static String getJob(Villager villager) {
            return villager.job;
        }

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
                final String[] maleNickname = {
                        "Eudes", "Garnier", "Gosse", "Josse", "Roul",
                        "Roland", "Vauqelin", "Jehan", "Fernnand", "Piers",
                        "Geoffroi", "Estienne", "Guiscard", "Onfroi", "Franchesco",
                        "Liam", "Oliver", "William", "Lucas", "Lex",
                        "Arne", "Bjorn", "Erik", "Sten", "Ulf",
                        "Rune", "Njal", "Frode", "Herald", "Sune"
                };
                Random randomMale = new Random();
                int index = randomMale.nextInt(maleNickname.length);
                return maleNickname[index];
            }
            if (nickname.equals("female")){
                final String[] femaleNickname = {
                        "Eudes", "Garnier", "Gosse", "Josse", "Roul",
                        "Roland", "Vauqelin", "Jehan", "Fernnand", "Piers",
                        "Geoffroi", "Estienne", "Guiscard", "Onfroi", "Franchesco",
                        "Frida", "Gertrud", "Estrid", "Liv", "Revna",
                        "Thyra", "Yrsa", "Astrid", "Inga", "Erica",
                        "Sigurda", "Embla", "Hella", "Eirunn", "Urda"
                };
                Random randomMale = new Random();
                int index = randomMale.nextInt(femaleNickname.length);
                return femaleNickname[index];
            }
            return nickname;
        }
    }
}