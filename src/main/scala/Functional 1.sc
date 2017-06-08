// Code to modify and print the contents of an array using Maps, Filters and Grouping.
java.util.TimeZone.getAvailableIDs().map(item => item.split('/')).filter(item => item.size > 1).map(a => a(1)).grouped(10).map(a => a(0)).toArray.foreach(item => println(item))

// Explanations
java.util.TimeZone.getAvailableIDs()
  .map(item => item.split('/'))       // Maps items to a temporary array. For every item, the item is split into two indexes where a '/' is found.
  .filter(item => item.size > 1)      // Removes all items that don't have more than one index (i.e. items that didn't split).
  .map(a => a(1))                     // Maps the second index (position 1) of each item to a new temporary array.
  .grouped(10)                        // Groups the items into sets of 10. This is useful if e.g. you want to get every tenth index (index 0 of a set of 10).
  .map(a => a(0))                     // Maps the first index of every set of 10 to a new temporary array.
  .toArray                            // Adds every mapped item to an array.
  .foreach(item => println(item))     // Prints each item in the array.
