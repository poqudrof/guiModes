


## GuiModes for Processing


A simple Mode gestion for Processing.
--

Description to come. 

[Latest release](http://papart.gforge.inria.fr/libraries/guiModes-24-04-15-10-05.tgz)

## Example Use

### Static Mode 

``` java
import fr.inria.guimodes.Mode; 

Mode.size();  // 0 
Mode.add("test1");
Mode.size();  // 1 

Mode.is("test1"); // false
Mode.set("test1"); 
Mode.is("test1"); // true

Mode.is("test2"); // false

Mode.clear();
Mode.size();  // 0
``` 

### Object Mode. 

``` java
import fr.inria.guimodes.SecondaryMode; 

SecondaryMode mode = new SecondaryMode();
mode.size();  // 0 
mode.add("test1");
mode.size();  // 1 

mode.is("test1"); // false
mode.set("test1"); 
mode.is("test1"); // true

mode.is("test2"); // false

mode.clear();
mode.size();  // 0

``` 

