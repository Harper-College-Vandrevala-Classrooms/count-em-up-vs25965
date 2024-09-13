package com.csc;

public class GroceryCalculations {

    int [] _counters = {0,0,0,0};
    int overflow = 0;

    public int tens(int _Tcounter)
  {
    if (_Tcounter >= 10){
        System.out.print("***This is a total overflow*** ");
        ++overflow;
       return _counters[0] = 0;
    }
    else{
        for (int i = 0; i < _Tcounter; i++){
		      ++_counters[0];    
             
	      }
        return _counters[0]; 
    }
  }

  public int ones (int _Tcounter2)
  {
    if (_Tcounter2 >= 10)
    {
        ++overflow;
        _counters[1] = 0;
        int valueover = _Tcounter2 - 9;

        if (valueover >=10){
        ++overflow;
        return _counters[0] = 0;
        }
        else{
          for (int i = 0; i <valueover; i++){
            ++_counters[0]; 
          }
          return _counters[0];
        }
   }
    else{
        for (int i = 0; i < _Tcounter2; i++){
		       ++_counters[1];         
	       }
         return _counters[1];
    }
    
  }
  public int tenths(int _Tcounter3)
  {
    if (_Tcounter3 >= 10){
        _counters[2] = 0;
        ++overflow;
        int valueover = _Tcounter3 - 9;

        if (valueover >=10){
        ++overflow;
        return _counters[1] = 0;
        }
        else{
          for (int i = 0; i <valueover; i++){
            ++_counters[1]; 
          }
          return _counters[1];
        }
    }
    else{
        for (int i = 0; i < _Tcounter3; i++){
		     ++_counters[2];         
	     }
       return _counters[2];
    }
    
  }
  public int hundeths(int _Tcounter4)
  {
    if (_Tcounter4 >= 10){
        _counters[3] = 0;
        ++overflow;
        int valueover = _Tcounter4 - 9;
        if (valueover >=10){
          ++overflow;
          return _counters[2] = 0;
        }
        else{
          for (int i = 0; i <valueover; i++){
            ++_counters[2]; 
          }
          return _counters[2]; 
        }
    }
    else{
        for (int i = 0; i < _Tcounter4; i++){
		     ++_counters[3];         
	     }
       return _counters[3]; 
    }
  }

  public void total ()
  {
    if (_counters[0] == 0)
    {
     System.out.println("total: $ " + _counters[1] + "." + _counters[2] + _counters[3]);
    }
    else{
      System.out.println("total: $ " + _counters[0] + _counters[1] + "." + _counters[2] + _counters[3]);
    }
  }

  public int  number_of_overflows()
  {
    System.out.println("\r\nNumber of overflows: " + overflow + "\r\n");
    return overflow;
  }

  public void clear()
  {
    for (int i = 0; i <= 3; i++)    
    {
      _counters[i] = 0 ;    
    }
    overflow = 0;
  }

}
