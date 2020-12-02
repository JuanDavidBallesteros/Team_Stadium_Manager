
package model;

import java.util.ArrayList;

//import sun.tools.tree.AssignShiftLeftExpression;

public class SoccerClub {

    private static final int TEAMS_SIZE = 2;

    private static final int ROWS_DR1 = 7;
    private static final int COLS_DR1 = 7;

    private static final int ROWS_DR2 = 7;
    private static final int COLS_DR2 = 6;

    private static final int ROWS_OFICES = 6;
    private static final int COLS_OFFICES = 6;

    private String clubName;
    private int nit;
    private String foundationDate;

    private ClubTeam[] clubTeams;
    private ArrayList<Employee> employees;

    private String exist = "Empleado existe";

    private Player[][] dressRoom1;
    private Player[][] dressRoom2;

    private Coach[][] offices;

    // -------------------- constructor -------------------------
    /**
     * Cosntructor SoccerClub Object <br>
     * <b>pre:</b> Create and SoccerClub object, this is the place where players,
     * coachs and teams exist. Atributes not null <br>
     * <b>post:</b> SoccerClub created
     * 
     * @param clubName       The club name in the app. clubName !=null
     * @param nit            The club ID. nit !=null
     * @param foundationDate The date of club foundation. foundationDate !=null
     */
    public SoccerClub(String clubName, int nit, String foundationDate) {
        this.clubName = clubName;
        this.nit = nit;
        this.foundationDate = foundationDate;

        clubTeams = new ClubTeam[TEAMS_SIZE];

        clubTeams[0] = new ClubTeam("Team A");
        clubTeams[1] = new ClubTeam("Team B");

        employees = new ArrayList<>();

        offices = new Coach[ROWS_OFICES][COLS_OFFICES];

        dressRoom1 = new Player[ROWS_DR1][COLS_DR1];
        dressRoom2 = new Player[ROWS_DR2][COLS_DR2];

        HeadCoach testCoach1 = new HeadCoach("Carter", 111, 3452, 6, 5, 1);
        HeadCoach testCoach2 = new HeadCoach("Guardiola", 222, 3452, 6, 5, 1);
        HeadCoach testCoach3 = new HeadCoach("Matu", 333, 3452, 6, 5, 1);

        AssitanCoach testAssitan = new AssitanCoach("Pedro", 555, 2432, 4, "si", 2);

        Player testPlayer1 = new Player("Messi", 11, 3341, 10, 100, 4, 3);
        Player testPlayer2 = new Player("Cris", 12, 3341, 10, 100, 4, 2);
        Player testPlayer3 = new Player("Duban", 13, 3341, 10, 100, 4, 3);
        Player testPlayer4 = new Player("Falcao", 14, 3341, 9, 100, 4, 2);
        Player testPlayer5 = new Player("james", 15, 3341, 10, 100, 4, 0);
        Player testPlayer6 = new Player("Pele", 16, 3341, 10, 100, 4, 1);

        Player testPlayer7 = new Player("David", 17, 3341, 10, 100, 4, 0);
        Player testPlayer8 = new Player("Cuadrado", 18, 3341, 10, 100, 4, 1);

        employees.add(testCoach1);
        employees.add(testCoach2);
        employees.add(testCoach3);

        employees.add(testAssitan);

        employees.add(testPlayer1);
        employees.add(testPlayer2);
        employees.add(testPlayer3);
        employees.add(testPlayer4);
        employees.add(testPlayer5);
        employees.add(testPlayer6);
        employees.add(testPlayer7);
        employees.add(testPlayer8);

        clubTeams[0].addLienUp("02/12/2020", "4-4-3", 2);

        clubTeams[0].addPlayerToTeam(testPlayer1);
        clubTeams[0].addPlayerToTeam(testPlayer2);
        clubTeams[0].addPlayerToTeam(testPlayer3);
        clubTeams[0].addPlayerToTeam(testPlayer4);
        clubTeams[0].addPlayerToTeam(testPlayer5);
        clubTeams[0].addPlayerToTeam(testPlayer6);
        clubTeams[0].addPlayerToTeam(testPlayer7);
        clubTeams[0].addPlayerToTeam(testPlayer8);
    }

    // test method
    public SoccerClub() {
        clubName = "Example Club";
        nit = 1234;
        foundationDate = "12/08/1967";

        clubTeams = new ClubTeam[TEAMS_SIZE];
        clubTeams[0] = new ClubTeam("Example Team 1");
        clubTeams[1] = new ClubTeam("Example Team 2");

        offices = new Coach[ROWS_OFICES][COLS_OFFICES];

        dressRoom1 = new Player[ROWS_DR1][COLS_DR1];
        dressRoom2 = new Player[ROWS_DR2][COLS_DR2];

        employees = new ArrayList<>();

        HeadCoach testCoach1 = new HeadCoach("Carter", 111, 3452, 6, 5, 1);
        HeadCoach testCoach2 = new HeadCoach("Guardiola", 222, 3452, 6, 5, 1);
        HeadCoach testCoach3 = new HeadCoach("Matu", 333, 3452, 6, 5, 1);

        AssitanCoach testAssitan = new AssitanCoach("Pedro", 555, 2432, 4, "si", 2);

        Player testPlayer1 = new Player("Messi", 11, 3341, 10, 100, 4, 3);
        Player testPlayer2 = new Player("Cris", 12, 3341, 10, 100, 4, 2);
        Player testPlayer3 = new Player("Duban", 13, 3341, 10, 100, 4, 1);
        Player testPlayer4 = new Player("Falcao", 14, 3341, 10, 100, 4, 1);
        Player testPlayer5 = new Player("james", 15, 3341, 10, 100, 4, 1);
        Player testPlayer6 = new Player("Pele", 16, 3341, 10, 100, 4, 1);

        employees.add(testCoach1);
        employees.add(testCoach2);
        employees.add(testCoach3);

        employees.add(testAssitan);

        employees.add(testPlayer1);
        employees.add(testPlayer2);
        employees.add(testPlayer3);
        employees.add(testPlayer4);
        employees.add(testPlayer5);
        employees.add(testPlayer6);

        clubTeams[0].addLienUp("02/12/2020", "4-4-3", 2);

        clubTeams[0].addPlayerToTeam(testPlayer1);
        clubTeams[0].addPlayerToTeam(testPlayer2);
        clubTeams[0].addPlayerToTeam(testPlayer3);
        clubTeams[1].addPlayerToTeam(testPlayer4);
        clubTeams[1].addPlayerToTeam(testPlayer5);
        clubTeams[1].addPlayerToTeam(testPlayer6);
    }

    // -------------------- Menu Operations -------------------------

    // option 11
    public String playerDressRoom(int id) {
        String message = "No se pudo encontrar";

        boolean inDR1 = false;
        boolean inDR2 = false;

        boolean finded = false;

        for (int i = 0; i < ROWS_DR1; i++) {
            for (int j = 0; j < COLS_DR1; j++) {
                if (dressRoom1[i][j] != null && dressRoom1[i][j].getId() == id && !finded) {
                    int posY = i + 1;
                    int posX = j + 1;
                    message = "Camerino 1, lugar: " + posY + "-" + posX;
                    inDR1 = true;
                }
            }
        }

        for (int i = 0; i < ROWS_DR2; i++) {
            for (int j = 0; j < COLS_DR2; j++) {
                if (dressRoom2[i][j] != null && dressRoom2[i][j].getId() == id && !finded) {
                    int posY = i + 1;
                    int posX = j + 1;
                    message = "Camerino 2, lugar: " + posY + "-" + posX;
                    inDR2 = true;
                }
            }
        }

        if (inDR1) {
            message += "\n";
            message += dr1Img();
        }

        if (inDR2) {
            message += "\n";
            message += dr2Img();
        }

        return message;
    }

    private String dr1Img() {
        String message = "";
        String[][] matriz = new String[ROWS_DR1][COLS_DR1];

        for (int i = 0; i < ROWS_DR1; i++) {
            for (int j = 0; j < COLS_DR1; j++) {
                if (dressRoom1[i][j] != null) {
                    matriz[i][j] = " [" + dressRoom1[i][j].getEmployeeName() + "] ";
                } else {
                    matriz[i][j] = " [Vacio] ";
                }
            }
        }

        for (int i = 0; i < ROWS_DR1; i++) {
            for (int j = 0; j < COLS_DR1; j++) {
                message += matriz[i][j];
            }
            message += "\n";
        }
        return message;
    }

    private String dr2Img() {
        String message = "";
        String[][] matriz = new String[ROWS_DR2][COLS_DR2];

        for (int i = 0; i < ROWS_DR2; i++) {
            for (int j = 0; j < COLS_DR2; j++) {
                if (dressRoom2[i][j] != null) {
                    matriz[i][j] = " [" + dressRoom2[i][j].getEmployeeName() + "] ";
                } else {
                    matriz[i][j] = " [Vacio] ";
                }
            }
        }

        for (int i = 0; i < ROWS_DR2; i++) {
            for (int j = 0; j < COLS_DR2; j++) {
                message += matriz[i][j];
            }
            message += "\n";
        }
        return message;
    }

    // option 9
    public String addPlayerToDressRoom(int id) {
        String message = "No se encontró el jugador";

        Player player = null;

        boolean emptyDR1 = true;
        boolean emptyDR2 = true;

        boolean asignedLetterTeam = false;

        boolean added = false;

        String teamDR1 = "";
        String teamDR2 = "";

        String playerTeam = null;

        // Dressroom 1 is empty
        for (int i = 0; i < ROWS_DR1; i++) {
            for (int j = 0; j < COLS_DR1; j++) {
                if (dressRoom1[i][j] != null) {
                    emptyDR1 = false;
                }
            }
        }

       

        // dressroom 2 es empty
        for (int i = 0; i < ROWS_DR2; i++) {
            for (int j = 0; j < COLS_DR2; j++) {
                if (dressRoom2[i][j] != null) {
                    emptyDR2 = false;
                }
            }
        }

        

        // get the player by id
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                player = (Player) employees.get(i);
            }
        }

        // assing player team
        if (player != null) {
            for (int k = 0; k < clubTeams[0].getPlayers().size(); k++) {
                if (clubTeams[0].getPlayers().get(k) != null && player.equals(clubTeams[0].getPlayers().get(k))) {
                    playerTeam = "a";
                }
            }
            for (int k = 0; k < clubTeams[1].getPlayers().size(); k++) {
                if (clubTeams[1].getPlayers().get(k) != null && player.equals(clubTeams[1].getPlayers().get(k))) {
                    playerTeam = "b";
                }
            }
        }

        

        // both dessrooms empnty
        if (playerTeam != null) {
            if (emptyDR1 && emptyDR2) {
                for (int i = 0; i < ROWS_DR1; i++) {

                    if (i % 2 == 0) {
                        for (int j = 0; j < COLS_DR2; j = j + 2) {
                            if (dressRoom1[i][j] == null && !added) {
                                dressRoom1[i][j] = player;
                                added = true;

                            }
                        }
                    }
                }
            }

            // asing team to dressroom
            if (!emptyDR1) {

                for (int i = 0; i < ROWS_DR1; i++) {

                    for (int j = 0; j < COLS_DR1; j++) {

                        if (dressRoom1[i][j] != null && !asignedLetterTeam) {

                            for (int k = 0; k < clubTeams[0].getPlayers().size(); k++) {
                                if (clubTeams[0].getPlayers().get(k) != null
                                        && dressRoom1[i][j].equals(clubTeams[0].getPlayers().get(k))) {
                                    teamDR1 = "a";
                                    teamDR2 = "b";
                                    asignedLetterTeam = true;
                                }
                            }
                            for (int k = 0; k < clubTeams[1].getPlayers().size(); k++) {
                                if (clubTeams[1].getPlayers().get(k) != null
                                        && dressRoom1[i][j].equals(clubTeams[1].getPlayers().get(k))) {
                                    teamDR1 = "b";
                                    teamDR2 = "a";
                                }
                            }
                        }
                    }
                }
            }

            // asing dressroom player

            if (playerTeam.equals("a") && teamDR1.equals("a")) {

                for (int i = 0; i < ROWS_DR1; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < COLS_DR1; j = j + 2) {
                            if (dressRoom1[i][j] == null && !added) {
                                dressRoom1[i][j] = player;
                                added = true;
                            }
                        }
                    }
                    if (i % 2 != 0) {
                        for (int j = 1; j < COLS_DR1; j = j + 2) {
                            if (dressRoom1[i][j] == null && !added) {
                                dressRoom1[i][j] = player;
                                added = true;
                            }
                        }
                    }
                }
            }

            if (playerTeam.equals("a") && teamDR2.equals("a")) {
                for (int i = 0; i < ROWS_DR2; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < COLS_DR2; j = j + 2) {
                            if (dressRoom2[i][j] == null && !added) {
                                dressRoom2[i][j] = player;
                                added = true;
                            }
                        }
                    }
                    if (i % 2 != 0) {
                        for (int j = 1; j < COLS_DR2; j = j + 2) {
                            if (dressRoom2[i][j] == null && !added) {
                                dressRoom2[i][j] = player;
                                added = true;
                            }
                        }
                    }
                }
            }

            if (playerTeam.equals("b") && teamDR1.equals("b")) {

                for (int i = 0; i < ROWS_DR1; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < COLS_DR1; j = j + 2) {
                            if (dressRoom1[i][j] == null && !added) {
                                dressRoom1[i][j] = player;
                                added = true;
                            }
                        }
                    }
                    if (i % 2 != 0) {
                        for (int j = 1; j < COLS_DR1; j = j + 2) {
                            if (dressRoom1[i][j] == null && !added) {
                                dressRoom1[i][j] = player;
                                added = true;
                            }
                        }
                    }
                }
            }

            if (playerTeam.equals("b") && teamDR2.equals("b")) {

                for (int i = 0; i < ROWS_DR2; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < COLS_DR2; j = j + 2) {
                            if (dressRoom2[i][j] == null && !added) {
                                dressRoom2[i][j] = player;
                                added = true;
                            }
                        }
                    }
                    if (i % 2 != 0) {
                        for (int j = 1; j < COLS_DR2; j = j + 2) {
                            if (dressRoom2[i][j] == null && !added) {
                                dressRoom2[i][j] = player;
                                added = true;
                            }
                        }
                    }
                }

            }
        }

        if (added) {
            message = " Jugador asignado  ";
        }

        return message;
    }

    // option 12
    public String coachOffice(int id) {
        String message = "No se pudo encontrar";

        for (int i = 0; i < ROWS_OFICES; i++) {
            for (int j = 0; j < COLS_OFFICES; j++) {
                if (offices[i][j] != null && offices[i][j].getId() == id) {
                    int posY = i + 1;
                    int posX = j + 1;
                    message = "Oficina: " + posY + " - " + posX;
                }
            }
        }

        message += "\n";
        message += coachOfficeImg();

        return message;
    }

    private String coachOfficeImg() {
        String message = "";
        String[][] matriz = new String[ROWS_OFICES][COLS_OFFICES];

        for (int i = 0; i < ROWS_OFICES; i++) {
            for (int j = 0; j < COLS_OFFICES; j++) {
                if (offices[i][j] != null) {
                    matriz[i][j] = " [" + offices[i][j].getEmployeeName() + "] ";
                } else {
                    matriz[i][j] = " [Vacio] ";
                }
            }
        }

        for (int i = 0; i < ROWS_OFICES; i++) {
            for (int j = 0; j < COLS_OFFICES; j++) {
                message += matriz[i][j];
            }
            message += "\n";
        }

        return message;
    }

    // option 10
    public String addCoachToOffice(int id) {
        String message = " No se pudo encontrar el entrenador";
        Coach coach = null;
        boolean added = false;

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Coach) {
                coach = (Coach) employees.get(i);
            }
        }

        if (coach != null) {
            for (int i = 0; i < ROWS_OFICES; i++) {

                if (i % 2 == 0) {
                    for (int j = 0; j < COLS_OFFICES; j = j + 2) {
                        if (offices[i][j] == null && !added) {
                            offices[i][j] = coach;
                            added = true;
                            message = "Entrenador asignado ";
                        }
                    }
                }
                if (i % 2 != 0) {
                    for (int j = 1; j < COLS_OFFICES; j = j + 2) {
                        if (offices[i][j] == null && !added) {
                            offices[i][j] = coach;
                            added = true;
                            message = " Entrenador asignado  ";
                        }
                    }
                }
            }
        }

        return message;
    }

    // Option 8

    public String showLineUp(String letter, String lineUpDate, int typeNum) {
        String message = "";

        if (letter.equals("A") || letter.equals("a")) {
            message = clubTeams[0].showLineUp(lineUpDate, typeNum);
        }

        if (letter.equals("B") || letter.equals("b")) {
            message = clubTeams[1].showLineUp(lineUpDate, typeNum);
        }

        return message;
    }

    // option 7

    public String addLineUpToTeam(String letter, String lineUpDate, String lineUpNum, int typeNum) {
        String message = "No añadida";

        if (letter.equals("A") || letter.equals("a")) {
            message = clubTeams[0].addLienUp(lineUpDate, lineUpNum, typeNum);
        }

        if (letter.equals("B") || letter.equals("b")) {
            message = clubTeams[1].addLienUp(lineUpDate, lineUpNum, typeNum);
        }

        return message;
    }

    // option 6

    // Employee object
    public String setEmployeeName(int id, String name) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                message = "Cambiando";
                employees.get(i).setEmployeeName(name);
            }
        }

        return message;

    }

    public String setEmployeeId(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                message = "Cambiando";
                employees.get(i).setId(numb);
            }
        }

        return message;
    }

    public String setEmployeeSalary(int id, float numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                message = "Cambiando";
                employees.get(i).setSalary(numb);
            }
        }
        return message;
    }

    // Coach object
    public String setCoachExperience(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Coach) {
                Coach coach = (Coach) employees.get(i);
                message = "Cambiado";
                coach.setExperienceYears(numb);
            }
        }
        return message;
    }

    // Head coach object
    public String setCoachChampionships(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                HeadCoach coach = (HeadCoach) employees.get(i);
                message = "Cambiado";
                coach.setAchivedChampionships(numb);
            }
        }
        return message;
    }

    public String setCoachTeamsInCharge(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                HeadCoach coach = (HeadCoach) employees.get(i);
                message = "Cambiado";
                coach.setTeamsInCharge(numb);
            }
        }
        return message;
    }

    // Assistan coach object
    public String setAssistanProfssional(int id, String text) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                AssitanCoach coach = (AssitanCoach) employees.get(i);
                message = "Cambiado";
                coach.setSoccerProfessional(text);
            }
        }
        return message;
    }

    public String setAssistanExpertise(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                AssitanCoach coach = (AssitanCoach) employees.get(i);
                message = "Cambiado";
                coach.setExpertise(numb);
            }
        }
        return message;
    }

    // Player Object
    public String setPlayerShirtNumber(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setShirtNumber(numb);
            }
        }
        return message;
    }

    public String setPalyerScoreGoals(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setScoredGoals(numb);
            }
        }
        return message;
    }

    public String setPlayerAverageMark(int id, double numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setAverageMark(numb);
                ;
            }
        }
        return message;
    }

    public String setPlayerRole(int id, int numb) {
        String message = "No cambiado";

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                Player player = (Player) employees.get(i);
                message = "Cambiado";
                player.setRole(numb);
            }
        }
        return message;
    }

    // Options 1 to 5
    public String takeOutFromTeam(String letter, int id) {
        String message = "No encontrado";
        String answer = "Empleado elimido del equipo";

        if (letter.equals("A") || letter.equals("a")) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i) instanceof Player && employees.get(i).getId() == id) {
                    employees.get(i).setActive(false);
                    message = answer;
                    Player player = (Player) employees.get(i);
                    clubTeams[0].getPlayers().remove(player);
                }
                if (employees.get(i) instanceof AssitanCoach && employees.get(i).getId() == id) {
                    employees.get(i).setActive(false);
                    message = answer;
                    AssitanCoach assitant = (AssitanCoach) employees.get(i);
                    clubTeams[0].getAssitants().remove(assitant);
                }
                if (employees.get(i) instanceof Coach && employees.get(i).getId() == id) {
                    employees.get(i).setActive(false);
                    message = answer;
                    clubTeams[0].setCoach(null);
                }
            }
        }

        if (letter.equals("B") || letter.equals("b")) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i) instanceof Player && employees.get(i).getId() == id) {
                    employees.get(i).setActive(false);
                    message = answer;
                    Player player = (Player) employees.get(i);
                    clubTeams[1].getPlayers().remove(player);
                }
                if (employees.get(i) instanceof AssitanCoach && employees.get(i).getId() == id) {
                    employees.get(i).setActive(false);
                    message = answer;
                    AssitanCoach assitant = (AssitanCoach) employees.get(i);
                    clubTeams[1].getAssitants().remove(assitant);
                }
                if (employees.get(i) instanceof Coach && employees.get(i).getId() == id) {
                    employees.get(i).setActive(false);
                    message = answer;
                    clubTeams[1].setCoach(null);
                }
            }
        }

        return message;
    }

    // Add coach to team
    public String addCoachToTeam(String letter, int id) {
        String message = " No se pudo ajustar el entrenador";
        HeadCoach coach = null;

        if (letter.equals("A") || letter.equals("a")) {
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                    employees.get(i).setActive(true);
                    coach = (HeadCoach) employees.get(i);
                    message = clubTeams[0].setCoach(coach);
                }
            }
        }

        if (letter.equals("B") || letter.equals("b")) {
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId() && employees.get(i) instanceof HeadCoach) {
                    employees.get(i).setActive(true);
                    coach = (HeadCoach) employees.get(i);
                    message = clubTeams[1].setCoach(coach);
                }
            }
        }

        return message;
    }
    // Add assitant to team

    public String addAssitantToTeam(String letter, int id) {
        String message = " No se pudo añadir el asistente";
        AssitanCoach assistan = null;

        if (letter.equals("A") || letter.equals("a")) {
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                    employees.get(i).setActive(true);
                    assistan = (AssitanCoach) employees.get(i);
                    message = clubTeams[0].addAssitantToTeam(assistan);
                }
            }
        }

        if (letter.equals("B") || letter.equals("b")) {
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId() && employees.get(i) instanceof AssitanCoach) {
                    employees.get(i).setActive(true);
                    assistan = (AssitanCoach) employees.get(i);
                    message = clubTeams[1].addAssitantToTeam(assistan);
                }
            }
        }

        return message;
    }

    // Add player to team

    public String addPlayertToTeam(String letter, int id) {
        String message = " No se pudo añadir el jugador";
        Player player = null;

        if (letter.equals("A") || letter.equals("a")) {
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                    employees.get(i).setActive(true);
                    player = (Player) employees.get(i);
                    message = clubTeams[0].addPlayerToTeam(player);
                }
            }
        }

        if (letter.equals("B") || letter.equals("b")) {
            for (int i = 0; i < employees.size(); i++) {
                if (id == employees.get(i).getId() && employees.get(i) instanceof Player) {
                    employees.get(i).setActive(true);
                    player = (Player) employees.get(i);
                    message = clubTeams[1].addPlayerToTeam(player);
                }
            }
        }

        return message;
    }

    // Player
    public String addEmployee(String employeeName, int id, double salary, int shirtNumber, int scoredGoals,
            double averageMark, int roleNum) {

        String message = "No se pudo añadir el jugador";
        boolean add = true;

        Employee newEmployee = new Player(employeeName, id, salary, shirtNumber, scoredGoals, averageMark, roleNum);

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                add = false;
                message = exist;
            }
        }
        if (add) {
            employees.add(newEmployee);
            message = "Jugador añadido";
        }
        return message;
    }

    public String addEmployee(String employeeName, int id, double salary, int experienceYears, int achivedChampionships,
            int teamsInCharge) {

        String message = "No se pudo añadir el entrenador";
        boolean add = true;

        Employee newEmployee = new HeadCoach(employeeName, id, salary, experienceYears, achivedChampionships,
                teamsInCharge);

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                add = false;
                message = exist;
            }
        }

        if (add) {
            employees.add(newEmployee);
            message = "Entrenador añadido";
        }
        return message;
    }

    public String addEmployee(String employeeName, int id, double salary, int experienceYears, String isProfessional,
            int expertiseNum) {

        String message = "No se pudo añadir el asistente";
        boolean add = true;

        Employee newEmployee = new AssitanCoach(employeeName, id, salary, experienceYears, isProfessional,
                expertiseNum);

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                add = false;
                message = exist;
            }
        }

        if (add) {
            employees.add(newEmployee);
            message = "Asistente añadido";
        }
        return message;
    }

    public String fireEmployeeInfo(int id) {

        String message = "Empleado no encontrado";

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null && employees.get(i).getId() == id) {
                message = "Eliminado";
                employees.remove(i);
            }
        }

        return message;
    }

    public String showClubInfo() {
        String message = "*********** Información Club ***********" + "\n";

        message += "** Club nombre" + getClubName() + "\n";
        message += "** Club fecha de dundación" + getFoundationDate() + "\n";
        message += "** Club NIT" + getNit() + "\n";

        message += "----------- Club Teams" + "\n";
        message += clubTeams[0].showTeamInfo() + "\n";
        message += clubTeams[1].showTeamInfo() + "\n";

        message += "----------- Club Employees: " + employees.size() + "\n";
        message += employeesInfo();

        return message;
    }

    private String employeesInfo() {
        String message = "";

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof HeadCoach) {
                message = message + employees.get(i).showInfo() + "\n";
            }
        }

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof AssitanCoach) {
                message = message + employees.get(i).showInfo() + "\n";
            }
        }

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof Player) {
                message = message + employees.get(i).showInfo() + "\n";
            }
        }

        return message;
    }

    public String showTeamInfo(String letter) {
        String message = "No encontrado";

        if (letter.equals("A") || letter.equals("a")) {
            message = clubTeams[0].showTeamInfo();
        }

        if (letter.equals("B") || letter.equals("b")) {
            message = clubTeams[1].showTeamInfo();
        }

        return message;
    }

    public String showEmployeeInfo(int id) {

        String message = "Empleado no encontrado";

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null && employees.get(i).getId() == id) {
                message = employees.get(i).showInfo();
            }
        }

        return message;
    }

    // -------------------- Auxiliar Operations -------------------------

    public String addTeam(String teamName) {
        String message = "No añadido";
        boolean add = false;

        ClubTeam newteam = new ClubTeam(teamName);

        for (int i = 0; i < TEAMS_SIZE; i++) {
            if (!add && clubTeams[i] != null) {
                clubTeams[i] = newteam;
                add = true;
                message = "Añadido";
            }
        }
        return message;
    }

    // -------------------- getters / settes -------------------------

    /**
     * Get clubName <br>
     * <b>pre:</b> Get clubName to pass as parameter. Soccer club must be created.
     * <br>
     * <b>post:</b> clubName
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * Set clubName <br>
     * <b>pre:</b> Set the club name. Soccer club must be created. <br>
     * <b>post:</b> Atribute updated
     * 
     * @param clubName An atribute of the object. clubName != null
     */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    /**
     * Get nit <br>
     * <b>pre:</b> Get nit to pass as parameter. Soccer club must be created.<br>
     * <b>post:</b> nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * Set nit <br>
     * <b>pre:</b> Set the nit. Soccer club must be created. <br>
     * <b>post:</b> Atribute updated
     * 
     * @param nit An atribute of the object. nit != null
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * Get foundationDate <br>
     * <b>pre:</b> Get foundationDate to pass as parameter. Soccer club must be
     * created. <br>
     * <b>post:</b> foundationDate
     */
    public String getFoundationDate() {
        return foundationDate;
    }

    /**
     * Set foundationDate <br>
     * <b>pre:</b> Set the foundation date. Soccer club must be created. <br>
     * <b>post:</b> Atribute updated
     * 
     * @param foundationDate An atribute of the object. foundationDate != null
     */
    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }
}
