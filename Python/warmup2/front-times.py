# Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

# front_times('Chocolate', 2) â†’ 'ChoCho'
# front_times('Chocolate', 3) â†’ 'ChoChoCho'
# front_times('Abc', 3) â†’ 'AbcAbcAbc'


def front_times(str, n):
  if len(str)<3:
    return n* str
  return n*str[:3]
