


## GuiModes for Processing


A simple Mode gestion for Processing.
--

Description to come. 

[Latest release](http://papart.gforge.inria.fr/libraries/guiModes-24-04-15-10-05.tgz)

## Example Use

### Static Mode 

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

### Object Mode. 

``` 
SecondaryMode mode = new SecondaryMode();


assertTrue(mode.size() == 0);
mode.add("test1");

assertTrue(mode.size() == 1);
mode.add("test2");

assertTrue(mode.size() == 2);
mode.set("test1");

mode.set("test1");
assertTrue(mode.is("test1"));
assertFalse(mode.is("test2"));

mode.set("test2");
assertTrue(mode.is("test2"));
assertFalse(mode.is("test1"));

mode.clear();
assertTrue(mode.size() == 0);

``` 

