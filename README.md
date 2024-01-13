# CodeTest_20240113

Appreciate that the code will meet the requirements:
1. Well-structure maven project
2. Proper unit test with high test coverage
3. Consider OO with proper design pattern
4. Use Java 11 or above if possible (advantage option)
4. Use some new feature from Java8 or above if possible (advantage option) 


# Stage 1
For a given string that only contains alphabet characters a-z, if 3 or more consecutive
characters are identical, remove them from the string. Repeat this process until
there is no more than 3 identical characters sitting besides each other.

Example:
Input: aabcccbbad
Output:
-> aabbbad
-> aaad
-> d

* test data
    * empty string
    * Blank String
    * illegal character aAAa
    * illegal character a??a
    * illegal character a a
    * a : a
    * aa : aa
    * aaa : (empty)
    * aaaa : (empty)
    * ab : ab
    * aab : aab
    * aaab : b
    * aaaab : b
    * abb : abb
    * aabb : aabb
    * aaabb : bb
    * aaaabb : bb
    * abbb : a
    * aabbb : aa
    * aaabbb : (empty)
    * aaaabbb : (empty)
    * abbbb : a
    * aabbbb : aa
    * aaabbbb : (empty)
    * aaaabbbb : (empty)
    * abc : abc
    * aabc : aabc
    * aaabc : bc
    * aaaabc : bc
    * abbc : abbc
    * aabbc : aabbc
    * aaabbc : bbc
    * aaaabbc : bbc
    * abbbc : ac
    * aaabbbc : c
    * aaaabbbbc : c
    * abcc : abcc
    * aaabcc : bcc
    * abccc : ab
    * aaabccc : b
    * aaaabcccc : bb
    * aaabbbccc : (empty)
    * aaaabbbbcccc : (empty)
    * aaabcccddeeefggg : bddf
    * aaabcccddeeefgggg : bddf
    * aaabcccddeeefggggh : bddfh
    * abbbccccdeeeefggg : adf
    * abbba : aa
    * abbbaa : aaa : (empty)
    * abbbba : aa
    * abbbbaa : aaa : (empty)
    * aabbba : aaa : (empty)
    * aabbbaa : aaaa : (empty)
    * aabbbbaa : aaaa : (empty)
    * abbcccba : abbba : aa
    * abbccccba : abbba : aa
    * abbcccbba : abbbba : aa
    * abbccccbbaa : abbbbaa : aaa : (empty)
    * aabbccccbbaa : aabbbbaa : aaaa : (empty)
    * abbcccbdeeed : abbbdd : add
    * abbcccbbddeeeed : abbbbddd : a
    * aabcccbbddeeeedd : aabbbdddd : aa
    * aabbbcccaaddaadd : aaaaddaadd : ddaadd
    * Generate 1000 random strings of lowercase letters for processing, 
        and then test if there are 3 or more consecutive characters are identical
        for 100,000 times
    
    
    

# Stage 2 - advanced requirement
Instead of removing the consecutively identical characters, replace them with a
single character that comes before it alphabetically.
Example:
ccc -> b
bbb -> a
Input: abcccbad
Output:
-> abbbad, ccc is replaced by b
-> aaad, bbb is replaced by a
-> d 

* test data
    * empty string
    * Blank String
    * illegal character aAAa
    * illegal character a??a
    * illegal character a a
    * a : a
    * aa : aa
    * aaa : (empty)
    * aaaa : (empty)
    * b : b
    * bb : bb
    * bbb : a
    * bbbb : a
    * ab : ab
    * aab : aab
    * aaab : b
    * aaaab : b
    * abb : abb
    * aabb : aabb
    * aaabb : bb
    * aaaabb : bb
    * abbb : aa
    * aabbb : aaa : (empty)
    * aaabbb : a
    * aaaabbb : a
    * abbbb : aa
    * aabbbb : aaa : (empty)
    * aaabbbb : a
    * aaaabbbb : a
    * ba : ba
    * bba : bba
    * bbba : aa
    * bbbba : aa
    * baa : baa
    * bbaa : bbaa
    * bbbaa : aaa : (empty)
    * bbbbaa : aaa : (empty)
    * baaa : b
    * bbaaa : bb
    * bbbaaa : a
    * abc : abc
    * aabc : aabc
    * aaabc : bc
    * aaaabc : bc
    * abbc : abbc
    * aabbc : aabbc
    * aaabbc : bbc
    * aaaabbc : bbc
    * abbbc : aac
    * aaabbbc : ac
    * aaaabbbbc : ac
    * abcc : abcc
    * abccc : abb
    * abbccc : abbb : aa
    * abbbccc : aab
    * aabbccc : aabbb : aaa : (empty)
    * aaabbccc : bbb : a
    * aaabccc : bb
    * aaaabcccc : b
    * aaaabbbcccc : ab
    * aaaabbbbcccc : ab
    * abbbcccd : aabd
    * abbbcddd : aacc
    * abbbcddde : aacce
    * aaabbbcdddeee : accd
    * aaabbbccdddeee : acccd : abd
    * abbbcccdeeefff : aabdde
    * abbbcccdeeefffg : aabddeg
    * aaabcccddeeefggg : bbdddff : bbcff
    
    * abbba : aaa : (empty)
    * abbbba : aaa : (empty)
    * abbbaa : aaa : (empty)
    
    * aabbba : aaa : (empty)
    * aabbbaa : aaaa : (empty)
    * aabbbbaa : aaaa : (empty)
    * abbcccba : abbba : aaa : (empty)
    * abbccccbaa : abbbbaa : aaaa : (empty)
    * abbcccdeeed : abbbddd : aac
    * abbcccbbdeefffeg : abbbbbdeeeeg : aaddg
    * Generate 1000 random strings of lowercase letters for processing, 
        and then test if there are 3 or more consecutive characters are identical
        for 100,000 times


