// Code to modify and print the contents of an array using Maps, Filters and Grouping.
java.util.TimeZone.getAvailableIDs().map(item => item.split('/')).filter(item => item.size > 1).map(a => a(1)).grouped(10).map(a => a(0)).toArray.foreach(item => println(item))
