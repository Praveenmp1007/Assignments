import re
text="Hello world"
a=re.search("Hello",text)
if a:
    print("Word found")
else:
    print("Word not found")