function latticePaths(gridSize) {
  let n = gridSize;
  let result = [];

  // Make n+1 size rows and columns
  for (let i = n; i >= 0; i--) {
    let row = [];
    row[n] = 1;
    result.push(row);
  }

  // Each point in row assign value of posible ways
  //  to reach bottom right point
  for (let i = n; i >= 0; i--) {
    for (let j = n - 1; j >= 0; j--) {
      if (i === n) {
        result[i][j] = 1;
      } else {
        result[i][j] = result[i][j + 1] + result[i + 1][j]
      }
    }
  }

  // Starting position is top left corner,
  //  so the answer is first element of first array
  return result[0][0];
}
