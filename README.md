# timer
A Java library for time management.  
# Usage
To use this library you must create an instance of pw/latematt/timer/Timer as such:  
`Timer timer = new Timer();`  
Once you create the instance, it keeps track of the milliseconds between it's creation and the system's current time.  


To convert milliseconds to other time measurements (seconds, minutes, hours, etc.) you would use pw/latematt/timer/TimeConverter as such:  
`TimeConverter converter = new TimeConverter()`  
Now, you can convert any method from Timer into a supported measure of time.  
# Installation
Maven users:

    <repositories>
        <repository>
            <id>latematt</id>
            <name>latematt's Repository</name>
            <url>http://latematt.pw/maven</url>
        </repository>
    </repositories>
    
    <dependencies>
        <dependency>
    	    <groupId>pw.latematt.timer</groupId>
    	    <artifactId>timer</artifactId>
    	    <version>1.0-STABLE</version>
    	</dependency>
    </dependencies>
    
Otherwise, download from [releases](https://github.com/latematt/timer/releases) and import as a library in your IDE.