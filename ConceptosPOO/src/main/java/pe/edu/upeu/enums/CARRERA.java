package pe.edu.upeu.enums;

enum FACULTAD {
    FIA,
    FCE,
    FACIHED,
    FCS
}
public enum CARRERA {
    Sistemas(FACULTAD.FIA),
    Civil(FACULTAD.FIA),
    Ambiental(FACULTAD.FIA),
    Arquitectura(FACULTAD.FIA),

    Administracion(FACULTAD.FCE),
    Contabilidad(FACULTAD.FCE);



    FACULTAD facultad;
    CARRERA (FACULTAD facultad) {
        this.facultad = facultad;
    }
}
