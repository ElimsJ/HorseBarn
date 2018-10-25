class HorseBarn{
    Horse[] spaces;
    private String name;
    private int weight;
    public HorseBarn(Horse[] horses)
    {

    }
    public String getName()
    {
        return this.name;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        for (int i = 0; i < this.spaces.length - 1; i++)
        {
            if (this.spaces[i] == null)
            {
                for (int j = i + 1; j < this.spaces.length; j++)
                {
                    if (this.spaces[j] != null)
                    {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }
}
