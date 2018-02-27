
foo = """
blah baz "hello"
"""

bar  = """the cake was "delicious"!"""
bar3 = """the cake was \"delicious\""""

quux = """"Hello!" I said"""

beep = """blah\tblah\tblah\n\n"""
beep = """\\\\\x"""


someQuoting = """\\"\\""""

excessiveQuoting = """   \\\\\\\\"\\\"  """

moreQuoting = """
""beep""\"\"
"""

manyEscapeCodes = """
\"\"\"\t\\\\"\"\"\"
"""

endingInEscapedNewline = """
"Golly!"\n
"""
