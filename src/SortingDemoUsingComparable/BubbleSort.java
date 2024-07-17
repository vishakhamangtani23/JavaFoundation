package SortingDemoUsingComparable;

public class BubbleSort
{
    public static void  bubblesortOfWords(String [] string,int n)
    {
        for(int i =0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
//                if(string[j].compareToIgnoreCase(string[j+1])>0)
                if(string[j].compareTo(string[j+1])>0)
                {
                    String temp = string[j];
                    string[j]=string[j+1];
                    string[j+1] = temp;

                }

            }
        }
        for(int  z=0;z<n;z++) {
            System.out.print(string[z]+" ");
        }

    }
    public static void bubblesort(int [] arr,int n)
    {
        for(int i =0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                System.out.println(arr[j]+" "+arr[j+1]);
                System.out.println(j+" "+(j+1));
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int  z=0;z<n;z++) {
            System.out.print(arr[z]+" ");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int [] arr =  {12,13,66,33,11,77,60,34,21,22};
        String [] strings ={"Vishs","Vish","Khush","Ok"};
        String [] names ={"Anjala","Sahil","karan","Choti","ok",};

        bubblesort(arr,n);
        bubblesortOfWords(strings, strings.length);
        bubblesortOfWords(names, names.length);

    }
}
