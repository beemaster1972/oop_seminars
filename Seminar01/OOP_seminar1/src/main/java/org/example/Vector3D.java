/*
Создайте класс, который описывает вектор (в трёхмерном пространстве). У него должны быть:
	конструктор с параметрами в виде списка координат x, y, z
	метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():

	метод, вычисляющий скалярное произведение:

	метод, вычисляющий векторное произведение с другим вектором:

	метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:

	методы для суммы и разности:


 */
package org.example;

/**
 * Класс описывающий трёхмерныё вектор
 */
public class Vector3D {
    private double x, y, z;
    private String name;
    private static char vectorIndex;
    static { vectorIndex = 'a';}

    /**
     * Конструктор вектора
     * @param name имя вектора
     * @param x координата X
     * @param y координата Y
     * @param z координата Z
     */
    public Vector3D(String name,double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Конструктор упрощенный.
     * @param name имя вектора
     * @param value значение по умолчанию, присваевоемое всем трём координатам. x = value,y=value,z=value
     */
    public Vector3D(String name, int value) {
        this(name, value, value, value);
    }

    /**
     * Конструктор с одним параметром. Координаты (0;0;0)
     * @param name имя вектора
     */
    public Vector3D(String name){
        this(name,0);
    }

    /**
     *  Пустой конструктор. Присваивает имя вектора a-z, с координатами (0;0;0)
     *
     */
    public Vector3D() {
        this(new StringBuilder().append(vectorIndex++).toString(),0);
    }

    /**
     * @apiNote Метод вычисляющий длину (скаляр) вектора
     * @return длину вектора
     */
    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @apiNote Метод вычисляющий скалярное произведение двух векторов
     * @param other второй вектор
     * @return число
     */
    public Double getScalarProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    /**
     * @apiNote Метод вычисляющий векторное произведение двух векторов
     * @param other второй вектор
     * @return возвращает новый вектор
     */
    public Vector3D getVectorProduct(Vector3D other) {
        return new Vector3D("Prod",y * other.z - z*other.y,x* other.z-z* other.x,x* other.y-y* other.x);
    }

    /**
     * @apiNote Метод вычислящий косинус угла между векторами
     * @param other второй вектор
     * @return возвращает значение косинуса угла
     */
    public double getCosAngle(Vector3D other){
        return getScalarProduct(other) / (getLength()*other.getLength());
    }

    /**
     * @apiNote Метод вычисляет сумму векторов
     * @param other - слагаемый вектор
     * @return возвращает новый вектор
     */
    public Vector3D getAdd(Vector3D other){
        return new Vector3D("VectorAdd",x+other.x,y+ other.y,z+other.z);
    }

    /**
     * @apiNote Возвращает разницу текущего вектора и other
     * @param other вычитаемый вектор
     * @return возвращает новый вектор
     */
    public Vector3D getSub(Vector3D other){
        return new Vector3D("VectorSub",x-other.x,y- other.y,z- other.z);
    }

    @Override
    public String toString() {
        return String.format("%s{%.2f;%.2f;%.2f}|%s|=%.2f",getName(),x,y,z,getName(),getLength());
    }

    public Double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    /**
     * @apiNote - метод устанавливающий имя вектора
     * @param name - имя вектора
     */
    public void setName(String name) {
        this.name = name;
    }
}
