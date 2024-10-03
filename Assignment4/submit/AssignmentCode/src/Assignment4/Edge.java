package Assignment4;

/**
 * The class for edge
 * @author H9
 * @version 1.0
 */
public class Edge{
    private  int u; // the first vertice
    private  int v; // the second vertice
    private int weight; // the weight between two vertices
 
    public Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
    
    /**
     * Gets the first edge
     * @return the first edge
     */
    public int getU() {
		return u;
	}

    /**
     * Sets the first edge
     */
	public void setU(int u) {
		this.u = u;
	}

    /**
     * Gets the second edge
     * @return the seond edge
     */
	public int getV() {
		return v;
	}

    /**
     * Sets the second edge
     */
	public void setV(int v) {
		this.v = v;
	}

    /**
     * Gets the weight between two vetices
     * @return the weight
     */
	public int getWeight() {
		return weight;
	}

    /**
     * Sets the weight between two vetices
     */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object object)
	{
		if (object == this)
			return true;
		if (object == null || object.getClass() != this.getClass())
			return false;
		else 
		{	
			Edge edge = (Edge)object;
			return (edge.getU() == this.getU() || edge.getU() == this.getV()) && (edge.getV() == this.getU() || edge.getV() == this.getV()) && edge.getWeight() == this.weight;
		}
	}
	
	@Override
	public String toString()
	{
		return "u:" + this.getU() + ", v:" + this.getV() + ", weight:" + this.getWeight();
	}
}
