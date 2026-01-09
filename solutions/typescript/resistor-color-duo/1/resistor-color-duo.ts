export function decodedValue(colors:Array<string>): number {
  const convertTab = [
    "black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white"
  ]
  let v1 = convertTab.indexOf(colors[0]);
  let v2 = convertTab.indexOf(colors[1]);
  return  Number(`${v1}${v2}`);
}
