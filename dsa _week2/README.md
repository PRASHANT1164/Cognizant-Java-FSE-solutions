# Algorithms and Data Structures

This repository includes my solutions for the Week 2 exercises assigned in the Cognizant Digital Nurture learning program.

## Exercise 1: Product Search for an E-commerce Platform

### Aim
Develop and compare Linear Search and Binary Search algorithms for locating products in an e-commerce catalog.

### Topics Covered
- Arrays
- Linear Search
- Binary Search
- Sorting Techniques
- Algorithm Complexity

### Implementation Highlights
- Product information is managed using a `Product` class.
- Product lookup using Linear Search.
- Product lookup using Binary Search.
- Performance comparison between both search methods.

### Complexity Analysis

| Algorithm | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

### Summary
Binary Search performs much faster on large collections because it repeatedly divides the search range into halves. The only prerequisite is that the data must be sorted before the search begins.

---

## Exercise 2: Investment Value Forecasting

### Aim
Create a recursive solution to estimate the future value of an investment using a constant annual growth rate.

### Topics Covered
- Recursion
- Mathematical Calculations
- Complexity Analysis

### Implementation Highlights
- Computes future investment value recursively.
- Demonstrates recursive function calls with a base condition.
- Displays the estimated value after the specified number of years.

### Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

### Optimization
Although recursion provides a clear and elegant solution, an iterative implementation can achieve the same result while reducing space complexity to **O(1)**.

---

## Submitted By

**Prashant Rai**  
**Registration No.: 23BAI11124**