package modelo;

public class notas {
    private float examen;
    private float taller;
    private float exposicion;
    private float quiz;
    private float definitiva;
    public notas(float examen, float taller, float exposicion, float quiz) {
        this.examen = examen;
        this.taller = taller;
        this.exposicion = exposicion;
        this.quiz = quiz;
        definitiva = 0f;

    }
    public float getExamen() {
        return examen;
    }
    public void setExamen(float examen) {
        this.examen = examen;
    }
    public float getTaller() {
        return taller;
    }
    public void setTaller(float taller) {
        this.taller = taller;
    }
    public float getExposicion() {
        return exposicion;
    }
    public void setExposicion(float exposicion) {
        this.exposicion = exposicion;
    }
    public float getQuiz() {
        return quiz;
    }
    public void setQuiz(float quiz) {
        this.quiz = quiz;
    }
    public float getDefinitiva() {
        return definitiva;
    }
    public void setDefinitiva(float definitiva) {
        this.definitiva = definitiva;
    }
    public void calcularDefinitiva(){
        definitiva = examen * 0.5f + taller * 0.3f + exposicion * 0.15f + quiz * 0.05f;
    }

}
