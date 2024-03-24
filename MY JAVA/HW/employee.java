public class employee {
    
abstract class employee {
    constructor() {}
    
    abstract work(): void;
  }
  
  class Developer  extends employee {
    work() {
      console.log();
    }
  }
  
  class Manager extends employee {
    work() {
      console.log();
    }
  }
  
  let Developer = new Developer ();
  let Manager = new Manager();
  
  Developer.work(); 
  Manager.work(); 
  
}
