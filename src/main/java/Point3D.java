public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = z;
    }

    //public Point3D(float x, float y, float z) {   //***
    public Point3D(float x, float y, float z){
       super(x,y);
        this.z =z;

}


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  float [] getXyZ(){
        return new float[]{x,y,z};
    }
    public void setXY(float x, float y , float z){
     //  this.setXY(x,y);
       this.z=z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
