def triangle_type(a, b, c):
    if a + b > c and a + c > b and b + c > a:
        if a == b == c:
            return "Рівносторонній"
        elif a == b or b == c or a == c:
            return "Рівнобедрений"
        else:
            return "Різносторонній"
    return "Трикутник не існує"

a, b, c = 3, 4, 5
print(triangle_type(a, b, c))
