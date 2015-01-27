

## GuiModes for Processing

A simple Mode gestion for Processing.
--

[Latest release](http://papart.gforge.inria.fr/libraries/guiModes.tgz)

## Example Use

``` java
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
