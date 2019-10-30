select distinct city from station where regexp_like(city, '[aeiou]$','i');
/* 
  $ : Matches the end of a string
  'i' :  for case-insensitive matching
*/
