import ru.readmanga.antimat.MatMatcher
def path = '../test.dat'
def matcher = new MatMatcher()
(1..2).each { n ->
  def input = new File("$path/in${n}.txt").text
  def out = matcher.replace(input, 'бип')
  def expectedLines = new File("$path/out${n}.txt").text.split("\n")
  out.eachLine { line, i ->
    def expected = expectedLines[i]
    assert expected == expected
  }
}


