public class HorseBarn {
    public interface Horse
    {
        String getName();
        int getWeight();
    }
    private Horse[] spaces;
    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i++)
        {
            if (this.spaces[i] !=null && name.equals(this.spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }
    public void consolidate()
    {
        int nextSpace = 0;

        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                spaces[nextSpace] = spaces[i];
                nextSpace++;
            }
        }

        for(int i = nextSpace; i < spaces.length; i++)
            spaces[i] = null;
    }

}
