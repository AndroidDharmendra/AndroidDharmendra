package 
public class BinarySearch {
    
          int key=30;
           int ar[]={10,20,30,0,50,60};
           int s=0,slap=0,e=ar.length-1;
          while(s<=e)
               {
               int mid= (s+e)/2
               if(key<ar[mid])
                     e=mid-1;
                  else if(key>ar[mid])
                     s=mid+1;
                  else if(key==ar[mid]){
                         slap++;
                         System.out.println("found the key "+ key+  " at index "+mid);
                   }
               }
               if(slap==0)
                  System.out.println(-1);          
}
