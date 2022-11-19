public enum Week {
    DUISHOMBU("""
            __________________________________
            | duishombu kunu:                |
            | 14:30-16:30-> English          |
            | 18:00-20:00-> tehn lesson(java)|
            |________________________________|"""),
    SHEISHEMBI("""
            ______________________________________
            | sheishembi kunu:                   |
            | 11:00-13:00-> praktika lesson(java)|
            | 14:30-16:30-> talking clab(beg)    |
            |____________________________________|"""),
    SHARSHEMBI("""
            __________________________________
            | sharshembi kunu:               |
            | 14:30-16:30->talkingn club(adv)|
            | 18:00-20:00->tehn lesson(java) |
            |________________________________|"""),
    BEISHEMBI("""
            ______________________________________
            | beishembi kunu:                    |
            | 11:00-13:00-> praktika lesson(java)|
            | 14:30-16:30-> soft skils           |
            |____________________________________|"""),
    JUMA("""
            _________________________________
            | juma kundoru:                 |
            | 15:00-17:00-> ivent           |
            | 18:00-20:00->tehn lesson(java)|
            |_______________________________|"""),
    ISHEMBI("""
            _____________________________
            | ishembi kunu:             |
            | 09;00-22;00-> erkin grafik|
            |___________________________|"""),
    JEKSHEMBI("""
            ___________________________
            | jekshembi kunu:         |
            | sabak jok-dem alysh kun |
            |_________________________|
            """);
    private String sabaktar;

    Week(String sabaktar) {
        this.sabaktar = sabaktar;
    }

    public String getSabaktar() {
        return sabaktar;
    }

    public void setSabaktar(String sabaktar) {
        this.sabaktar = sabaktar;
    }

    @Override
    public String toString() {
        return  super.toString()+ "\n"+sabaktar;
    }
}
